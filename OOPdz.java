public class OOPdz {
    public static class Person{
        public final String fullName,job,email,numTelephone;
        public final int salary,age;
        public Person(String fullName, String job, String email, String numTelephone,int salary,int age){
            this.fullName=fullName;
            this.job=job;
            this.email=email;
            this.numTelephone=numTelephone;
            this.salary=salary;
            this.age=age;
        }

        public void printInfo() {
            System.out.println("ФИО: "+this.fullName+"\n"+
                    "Должность: "+this.job+"\n"+
                    "Почта: "+this.email+"\n"+
                    "Номер телефона: "+this.numTelephone+"\n"+
                    "Зарплата: "+this.salary+"\n"+
                    "Возраст: "+this.age+"\n");
        }
    }
    public static void main(String[] args) {
        Person[] personList= new Person[5];
        personList[0]=new Person("Кей С","Писатель", "key@mail.com","88005553535",15000 , 45);
        personList[1]=new Person("Ней С","Таксист", "ney@mail.com","88015553535",15001 , 35);
        personList[2]=new Person("Цей С","Таксист", "cey@mail.com","88025553535",15002 , 30);
        personList[3]=new Person("Вей С","Куратор", "vey@mail.com","88035553535",15003 , 80);
        personList[4]=new Person("Фей С","Питонист-Программист", "phey@mail.com","88045553535",15004 , 15);
        for (Person persons: personList
        ) {
            if(persons.age>40){
                persons.printInfo();
            }
        }
    }
}
