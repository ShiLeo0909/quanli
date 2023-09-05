package thicuoiki;
public class Shoes {
        private String id;
        private String name;
        private String manu;
        private int year;
        private double price;

        public Shoes(String id, String name, String manu, int year, double price) {
            this.id = id;
            this.name = name;
            this.manu = manu;
            this.year = year;
            this.price = price;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return manu;
        }

        public void setAuthor(String manu) {
            this.manu = manu;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Shoes[" +
                    "id=" + id +
                    ",name=" + name +
                    ",manu=" + manu +
                    ",year=" + year +
                    ",price=" + price +
                    ']';
        }
}
