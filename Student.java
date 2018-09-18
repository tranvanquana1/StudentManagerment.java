public class Student {
    //thuoc tinh student
    private String name, id, group, email;
    //ham getName
    public String getName(){
        return name;
    }
    //ham setName
    public String setName(String name){
        this.name=name;
        return name;
    }
    //ham getGroup
    public String getGroup(){
        return group;
    }
    //ham setGroup
    public String setGroup(String group){
        this.group=group;
        return group;
    }
    //ham getID
    public String getID(){
        return id;
    }
    //ham getInfo
    public String getInfo(){
        System.out.println("name: "+this.name);
        System.out.println("id: "+this.id);
        System.out.println("group: "+this.group);
        System.out.println("email: "+this.email);
        return (this.name+this.id+this.group+this.email);
    }
    //ham tao mac dinh
    Student(){
        this.name="Student";
        this.id="000";
        this.group="K59CB";
        this.email="uet@vnu.edu.vn";
    }
    //ham tao co doi
    Student (String name,String id,String group, String email){
        this.name=name;
        this.id=id;
        this.group=group;
        this.email=email;
    }
    //ham tao sao chep
    Student( Student c){
        this.name=c.name;
        this.id=c.id;
        this.group=c.group;
        this.email=c.email;
    }

}


