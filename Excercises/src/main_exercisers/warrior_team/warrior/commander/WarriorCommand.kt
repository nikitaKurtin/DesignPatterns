package main_exercisers.warrior_team.warrior.commander

import main_exercisers.warrior_team.warrior.WarriorMediator

/**
 * Command
 */
interface WarriorCommand {
	fun execute()
	val commandInfo: String
}

class AttackCommand(private val comm: WarriorMediator) : WarriorCommand {
	override val commandInfo: String
		get() = "Attack"

	override fun execute() {
		for (w in comm.warriors) {
			w.ability.engage()
		}
	}
}

class ChangeAbilityCommand(private val comm: WarriorMediator, private val ability: String) : WarriorCommand {
	override val commandInfo: String
		get() = "Change Abilities to $ability"

	override fun execute() {
		for (w in comm.warriors) {
			w.setAbility(ability)
		}
	}

}