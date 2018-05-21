import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Building1Test {

    @Test
    void setBuildingNameTest(){
        String oldName = building.getName();
        building.setName("testName2");
        String newName = building.getName();
        assertFalse(oldName.equals(newName));
    }

    @Test
    void setBuildingDataTest(){
        String oldName = building.getName();
        Map oldMap = building.getMap();
        Space oldBuildingLocation = building.getBuildingLocation();
        building.setName("testName2");
        building.setMap(testMap2);
        building.setBuildingLocation(testBuildingLocation2);
        String newName = building.getName();
        Map newMap = building.getMap();
        Space newBuildingLocation = building.getBuildingLocation();
        assertFalse(oldName.equals(newName));
        assertFalse(oldMap.equals(newMap));
        assertFalse(oldBuildingLocation.equals(newBuildingLocation));
    }

    @Test
    void deleteMapTest(){
        if (building.getMap != null){
            building.deleteMap();
            assertTrue(building.getMap == null);
        }
    }

    @Test
    void uploadMapFromTextFileTest(){
        if (building.getMap != null){
            Map oldMap = building.getMap();
            building.uploadMapFromTextFile(testFile2);
            Map newMap = building.getMap();
            assertTrue(building.getMap != null);
            assertFalse(oldMap.equals(newMap));
            building.deleteMap();
            assertTrue(building.getMap == null);
            building.uploadMapFromTextFile(testFile2);
            assertTrue(building.getMap != null);
        } else {
            building.uploadMapFromTextFile(testFile2);
            assertTrue(building.getMap != null);
        }
    }

}