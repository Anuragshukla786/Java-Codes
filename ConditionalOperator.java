public class ConditionalOperator {
    public static void main(String[] args) {
        
        int age=21;
        
        // if(age>=18)
        // {
        //     System.out.println("Legal adult");

        // }
        // else
        // {
        //     System.out.println("you are kid");
        // }



        // if(age >=18 && age <60)
        // {
        //     System.out.println("You're  an adult");
        // }
        // else if(age >=60)
        // {
        //     System.out.println("you're old man now");
        // }
        // else
        // {
        //     System.out.println("you're still a kid");
        // }

        //Nested if condition

        if(age >=18 && age <=60)
        {
            
            if(age >20 && age <30)
            {
                System.out.println("you're in 20's");
            }
            else if(age >=30 && age <=40)
            {
                System.out.println("you're in 30's");
            }
            else
            {
                System.out.println("you're still teen");
            }
        
        }
        else if (age>60)
        {
            System.out.println("you're an old man");
            
        }
        else if(age >=16 && age <18)
        {
            System.out.println("you're teen ager");
        }
        else
        {
            System.out.println("you're still a kid");
        }
        
    }
    
}
