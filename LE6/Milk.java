class Milk extends Decorator{
    Milk(Offering offering){
        this.offering=offering;
    }
    String getName(){
        return offering.getName() + " with Milk";
    }
    int getprice(){
        return offering.getprice()+ 40;
    }
}