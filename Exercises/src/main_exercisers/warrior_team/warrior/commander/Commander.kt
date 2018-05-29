package main_exercisers.warrior_team.warrior.commander

/**
 * Invoker class
 */
class Commander(val name: String) {
	fun callCommand(command: WarriorCommand) {
		println("Commander $name order to ${command.commandInfo}")
		command.execute()
	}
}