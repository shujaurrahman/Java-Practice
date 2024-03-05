public class leatherbag {
    public static void main(String[] args) {
        bag bag1=new bag();
        bag bag2=new bag();
        bag bag3=new bag();

        bag1.setCompany("Zara");
        bag1.setname("1name");
        bag1.setBagType("Plastic");
        bag2.setCompany("Zara");
        bag2.setname("3name");
        bag2.setBagType("Bullshit");
        bag3.setCompany("Zara");
        bag3.setname("Leather company");
        bag3.setBagType("leather");

        bag bagfound=findLeatherBag(bag1,bag2,bag3);

        System.out.println("Leather Bag found is : "+bagfound.getCompany()+"\n"+bagfound.getname());

    }

    public static bag findLeatherBag(bag... bags){
        bag leatherBag=bags[0];
        for(int i=0;i<bags.length;i++){
            if (bags[i].getBagtype()=="leather") {
                leatherBag=bags[i];
                break;
            }
        }
        return leatherBag;
    }
}
