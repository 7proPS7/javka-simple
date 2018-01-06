package car.analizer.util.innerclass;

public class High {
    private int value = 30;

    class Medium {
        private int value = 20;

        class Low {
            private int value = 10;

            public int getLowValue() {
                return value;
            }

            public int getLowValueAndUseThis() {
                return this.value;
            }

            public int getMediumValue() {
                return Medium.this.value;
            }

            public int getHighValue() {
                return High.this.value;
            }
        }
    }
}
