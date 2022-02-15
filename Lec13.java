/*
AGENDA: lets study about stringbuilder class        //damn important
*/

class Lec13{
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Prakhar");

        System.out.println(sb.charAt(0));           //we have seen this function in String class as well.
        sb.setCharAt(1,'m');                        //we can change particular index value with this function, thats the beauty of StringBuilder class. 
        System.out.println(sb);

        //inserting at index
        sb.insert(3,'l');
        System.out.println(sb);

        //deleting
        sb.delete(2,3);             //this function accepts two arguments starting index and end index which is not inclusive.
        System.out.println(sb);

        //appending
        sb.append("hello");                 //we can pass characters as well.   remember in case of stringbuilder, changes are taking place in samme memory location not like String 
         System.out.println(sb);

    }
}