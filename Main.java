public class Main {

    public static void main(String args[]){

        // Votting Scenario

          boolean isUnderage = false
          boolean isEthiopian = true
          boolean hasAnID = true
          boolean isPreviousVoter = false
          boolean criminalRecord =true

          boolean canVote = !isUnderage && isEthiopian && ((hasAnID || isPreviousVoter) && criminalRecord || (isPreviousVoter || criminalRecord) & hasAnID || (hasAnID || criminalRecord) && isPreviousVoter)

          System.out.println (canVote)
    }
}
