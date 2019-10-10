package JavaOOP6.task3;

class Distance {
    public void print(){
    }
    public static class Converter {
        public static double methodMMvSM (double distance ){
            double result = distance / 10;
            return result;
        }
        public static double methodSMvMM (double distance){
            double result = distance * 10;
            return  result;
        }
        public static double methodMMvM (double distance){
            double result = distance / 1000;
            return result;
        }
        public static double methodMvMM (double distance){
            double result = distance * 1000;
            return result;
        }
        public static double methodMMvKM (double distance){
            double result = distance / 1000000;
            return result;
        }
        public static double methodKMvMM (double distance){
            double result = distance * 1000000;
            return result;
        }
        public static double methodSMvM (double distance){
            double result= distance / 100;
            return result;
        }
        public static double methodMvSM (double distance){
            double result = distance * 100;
            return result;
        }
        public static double methodSMvKM (double distance){
            double result =  distance / 100000;
            return result;
        }
        public static   double methodKMvSM (double distance){
            double result = distance * 100000;
            return result;
        }
        public static double methodMvKM (double distance){
            double result = distance / 1000;
            return result;
        }
        public static double methodKMvM (double distance){
            double result = distance * 1000;
            return result;
        }

    }
}
