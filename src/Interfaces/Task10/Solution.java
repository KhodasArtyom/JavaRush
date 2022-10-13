package Interfaces.Task10;

public class Solution {
    public static void main(String[] args) {

    }
    interface Person {
        void use(Person person);

        void starToWork();
    }

    interface HasManagementPotential{
        boolean inspiresOthersToWork();

    }

    interface Secretary extends Person{

    }

    interface Boss extends Person, HasManagementPotential{

    }

    class Manager implements Boss  {
        public void use (Person person) {
            person.starToWork();
        }

        @Override
        public void starToWork() {

        }

        public void startToWork() {

        }
        public boolean inspiresOthersToWork() {
            return true;
        }
    }

    class Subordinate implements Secretary {
        public void use(Person person) {

        }

        @Override
        public void starToWork() {

        }

        public void startToWork() {

        }
    }
}
