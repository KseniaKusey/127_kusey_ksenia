public class Car {
        private String name;
        private String brand;
        private int year;
        private int total_distance;

    public Car(String name, String brand, int year, int total_distance){
            this.name = name;
            this.brand = brand;
            this.year = year;
            this.total_distance = total_distance;
        }

        public String getName () {
            return this.name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getBrand () {
            return this.brand;
        }

        public void setBrand (String brand){
            this.brand = brand;
        }

        public int getYear () {
            return this.year;
        }

        public void setYear ( int year){
            this.year = year;
        }

        public int getTotal_distance () {
            return this.total_distance;
        }

        public void setTotal_distance ( int total_distance){
            this.total_distance = total_distance;
        }

        public void trip ( int distance){
            this.setTotal_distance(this.getTotal_distance() + distance);
        }
}