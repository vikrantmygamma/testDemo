public class MapsWithEnumValuesReplaceWithEnumMap {

  public enum COLOR {
    RED, GREEN, BLUE, ORANGE;
  }

  public void mapMood() {
	Map<Integer,String> map=new HashMap<Integer,String>();      
	// EMB-ISSUE: CodeIssueNames.MAPS_WITH_ENUM_VALUES_REPLACE_WITH_ENUMMAP
    Map<COLOR, String> moodMap = new HashMap<COLOR, String> ();
  }
}
