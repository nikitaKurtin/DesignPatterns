package gof_exercises.builder_user;

public class User {
    private String username;
    private String password;
    private String email;
    private int age;
    private String gender;
    private String nickname;

    public String getGender() {
        return gender;
    }

    public String getNickname() {
        return nickname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "first name: " + username + ", last name: " + password + ", age: " + age + ", email: " + email;
    }

    static class Builder {
        private String name, pass, email, nickname, gender;
        private int age;

        public Builder setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setUserName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPassword(String pass) {
            this.pass = pass;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            if (name == null || pass == null) throw new IllegalStateException("must have user name & pass");

            User u = new User();
            u.username = name;
            u.password = pass;
            u.email = email;
            u.nickname = nickname;
            u.gender = gender;
            u.age = age;
            return u;
        }
    }
}
