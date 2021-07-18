package Work.Inheritans;

public class British extends Cat {

    private String name;

    public British(int age, String owner, String name) {
        super(age, owner);
        this.name = name;
    }

    public void sayBritish() {
        System.out.println("Ya British");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat name: " + name + " Age: " + getAge() + " Owner: " + getOwner();
    }

    public boolean equals (Object obj){
        if (this == obj){
            return true;
        } if(obj == null){
            return false;
        }if(getClass() == obj.getClass()){
            British outObj = (British) obj;
            return name.equals(outObj.name)
                    && getAge() == outObj.getAge()
                    && getOwner().equals(outObj.getOwner());

        }
        return false;
    }

}
