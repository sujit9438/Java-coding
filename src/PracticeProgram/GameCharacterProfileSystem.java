package PracticeProgram;

import java.util.Scanner;

public class GameCharacterProfileSystem {

	public static void main(String[] args) throws CloneNotSupportedException
    {
        Scanner sc = new Scanner(System.in);
        String characterId=sc.next();
        String playerName=sc.next();
        int level=sc.nextInt();
        double health=sc.nextDouble();
        if(characterId.length()<3 ||playerName.length()<3||playerName.length()>20||level<0|| health<0)
        {
            System.out.println("Error: Invalid character details");
            System.exit(0);
        }
        GameCharacter a= new GameCharacter(characterId,playerName,level,health);

        System.out.println("Original Character:");
         System.out.println(
                "CharacterId=" + characterId +
                ", PlayerName=" + playerName +
                ", Level=" + level +
                ", Health=" + health);

         GameCharacter b = a.clone();

        b.level = b.level + 5;
        b.health = b.health - 20;
        
         System.out.println("Cloned Character:");
        System.out.println(
                "CharacterId=" + b.characterId +
                ", PlayerName=" + b.playerName +
                ", Level=" + b.level +
                ", Health=" + b.health);   
    }

}
class GameCharacter implements Cloneable
{
    public String characterId;
    public String playerName;
    public int level;
    public double health;
    public GameCharacter(String characterId,String playerName,int level,double health)
    {
        this.characterId=characterId;
        this.playerName=playerName;
        this.level=level;
        this.health=health;
    }
    public GameCharacter clone()throws CloneNotSupportedException
    {
        return (GameCharacter)super.clone();
    }
}

