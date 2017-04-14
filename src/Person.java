/**
 * Created by USER on 2017/4/14.
 */
public class Person {
    protected String name, id, barcode, category, description;
    protected float price;
    public Person(){}
    public Person(String name1,String id1){
        this.name = name1;
        this.id = id1;
    }
    public void setName(String name1){
        name = name1;
    }
    public String getName() {
        return name;
    }
    public void setBarcode(String barcode1){
        barcode = barcode1;
    }
    public String getBarcode() {
        return barcode;
    }
    public void setCategory(String category1){
        category = category1;
    }
    public String getCategory() {
        return category;
    }
    public void setDescription(String description1){
        description = description1;
    }
    public String getDescription() {
        return description;
    }
    public void setPrice(float price1){
        price = price1;
    }
    public float getPrice() {
        return price;
    }
    public void getInfo(){
        System.out.println("name:"+this.getName()+
                "(id:"+this.id+") \ndescription:"+
                this.description+"\nprice:"+
                this.getPrice()+"\nbarcode:"+
                this.getBarcode());
    }
    public void Show(){
        System.out.println("name:"+this.getName()+
                "(id:"+this.id+") \ndescription:"+
                this.description+"\nprice:"+
                this.getPrice()+"\nbarcode:"+
                this.getBarcode());
    }
}
