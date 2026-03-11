class NotEligibleForEngineering extends RuntimeException
{
    NotEligibleForEngineering(String s)
    {
        super(s);
    }
}

class NotEligibleForVJIT extends RuntimeException
{
    NotEligibleForVJIT(String s)
    {
        super(s);
    }
}

class TSEngineeringAdmission
{
    public static void main(String[] args)
    {
        try
        {
            int score = Integer.parseInt(args[0]);

            if(score < 50)
            {
                throw new NotEligibleForEngineering(
                    "Not Eligible for Engineering. Score must be at least 50."
                );
            }
            else if(score < 70)
            {
                throw new NotEligibleForVJIT(
                    "Eligible for Engineering but Not Eligible for VJIT."
                );
            }
            else
            {
                System.out.println("Welcome to VJIT-Thanks For Your Registration!");
            }
        }

     
        catch (NotEligibleForEngineering | NotEligibleForVJIT e)
        {
            System.out.println("StackTrace Output:");
            e.printStackTrace();

            System.out.println("Using getMessage(): " + e.getMessage());

            System.out.println("Using toString(): " + e.toString());
        }

        System.out.println("Rest of the Code");
    }
}
