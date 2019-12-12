package sia.knights;
  
public class BraveKnight implements Knight {

  private Quest quest;

  public BraveKnight(Quest quest) {
    this.quest = quest;
  }

  public void embarkOnQuest() {
    quest.embark();
  }

  public void setA(String a) {
    System.out.println(111111);
  }
}
