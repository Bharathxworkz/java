package com.xworkz.teaapp.chaipoint;

    public class ChaiWala {
        private  int chaID;
        private String chaiName;
        private  double price;
        private String chaiType;
        private  String qantity;

        @Override
        public String toString() {
            return "ChaiWala-(ChaiId :"+this.chaID+","+
                    "chai Name:"+ this.chaiName+","+
                    "chai Price:"+ this.price+","+
                    "chai chaitype:"+ this.chaiType+","+
                    "chai quabtity:"+this.qantity+")";
        }

        public void setChaID(int chaID) {
            this.chaID = chaID;
        }

        public int getChaID() {
            return chaID;
        }

        public void setChaiName(String chaiName) {
            this.chaiName = chaiName;
        }

        public String getChaiName() {
            return chaiName;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setChaiType(String chaiType) {
            this.chaiType = chaiType;
        }

        public String getChaiType() {
            return chaiType;
        }

        public void setQantity(String qantity) {
            this.qantity = qantity;
        }

        public String getQantity() {
            return qantity;
        }
    }



