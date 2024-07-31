import java.util.Scanner;

public class Malawi2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================MALAWI ELECTORAL COMMISSION================================\n");

        // Get total number of published centers
        final int percent = 100;
        System.out.print("Enter Total published centers: ");
        int totalPublishedCenters = scanner.nextInt();

        // Get the total number of registered votes
        System.out.print("Enter Total Registered Voters/Turnout: ");
        int totalRegisteredVotes = scanner.nextInt();
        System.out.print("Enter Total Votes Cast/Total Votes: ");
        int totalVotesCast = scanner.nextInt();

        // Get total number of Null & Void votes
        System.out.print("Enter Total Null & Void Votes/Invalid Votes: ");
        int nullAndVoid = scanner.nextInt();

        System.out.print("Enter Total Valid Votes: ");
        int totalValidVotes = scanner.nextInt();

        // Get total valid votes for each candidate
        System.out.print("Enter Total Valid Votes for Dr Lazarus Chakwera: ");
        int totalValidVotesForLazarusChakwera = scanner.nextInt();

        System.out.print("Enter Total Valid Votes for Peter Driver Sinos Kuwani: ");
        int totalValidVotesForPeterKuwani = scanner.nextInt();

        System.out.print("Enter Total Valid Votes for Professor Arthur Peter Mutharika: ");
        int totalValidVotesForArthurMutharika = scanner.nextInt();

        // Determine the winner
        if (totalValidVotesForLazarusChakwera > totalValidVotes / 2.0) {
            System.out.println("Congratulations Dr Lazarus Maccathy Chakwera, you're a winner of the 2020 election\n\n");
        } else if (totalValidVotesForPeterKuwani > totalValidVotes / 2.0) {
            System.out.println("Congratulations Peter Kuwani, you're a winner of the 2020 election\n\n");
        } else if (totalValidVotesForArthurMutharika > totalValidVotes / 2.0) {
            System.out.println("Congratulations Professor Arthur Peter Mutharika, you're a winner of the 2020 election\n\n");
        } else {
            System.out.println("No majority winner was found. RUNOFF may be required\n");
        }

        System.out.println("____________________________________ELECTION STATISTICS___________________________________\n");

        // Calculating percentage

        // Calculating percentage for total votes cast
        double percentage = Math.round((double) totalVotesCast * percent / totalValidVotes * 100.0) / 100.0;
        System.out.println("Total Votes Cast in percentage = " + percentage);

        // Calculating percentage for total valid votes for all candidates
        percentage = Math.round((double) totalValidVotes * percent / totalVotesCast * 100.0) / 100.0;
        System.out.println("Total Valid Votes for all candidates in percentage = " + percentage);

        // Calculating percentage for null & void votes
        percentage = Math.round((double) nullAndVoid * percent / totalValidVotes * 100.0) / 100.0;
        System.out.println("Total Null & Void votes in percentage = " + percentage);

        // Calculating percentage for Total Registered voters/turnout
        percentage = Math.round((double) totalVotesCast * percent / totalRegisteredVotes * 100.0) / 100.0;
        System.out.println("Total Registered voters/turnout in percentage = " + percentage);

        // Calculating percentage for Dr Lazarus Chakwera
        percentage = Math.round((double) totalValidVotesForLazarusChakwera * percent / totalValidVotes * 100.0) / 100.0;
        System.out.println("Total Valid Votes for Dr Lazarus Chakwera in percentage = " + percentage);

        // Calculating percentage for Peter Kuwani
        percentage = Math.round((double) totalValidVotesForPeterKuwani * percent / totalValidVotes * 100.0) / 100.0;
        System.out.println("Total Valid Votes for Peter Kuwani in percentage = " + percentage);

        // Calculating percentage for Professor Mutharika
        percentage = Math.round((double) totalValidVotesForArthurMutharika * percent / totalValidVotes * 100.0) / 100.0;
        System.out.println("Total Valid Votes for Professor Mutharika in percentage = " + percentage);

        scanner.close();
    }
}
