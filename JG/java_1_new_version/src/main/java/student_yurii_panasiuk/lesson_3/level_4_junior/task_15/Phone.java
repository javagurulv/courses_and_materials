package student_yurii_panasiuk.lesson_3.level_4_junior.task_15;

class Phone {

    String model;

        Phone(String model) {
            this.model = model;
        }

        String getModel() {
            return this.model;
        }

    }

    class PhoneDemo {

        public static void main(String[] args) {
            Phone myPhone = new Phone("Huawei");
            String phoneModel = myPhone.getModel();
            System.out.println("Phone model = " + phoneModel);
        }

    }