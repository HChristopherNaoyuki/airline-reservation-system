package Solutions;

public class Airplane 
{
    private final String[] airplaneList = 
    {
        "1. KE123: Korean Air's international flight (Seoul(ICN) - Tokyo(HND))",
        "2. OZ456: Asiana Airlines' international flight (Seoul(ICN) - Shanghai(PVG))",
        "3. 7C789: Jeju Air's domestic flight (Seoul(GMP) - Busan(PUS))",
        "4. BX987: Air Busan's domestic flight (Seoul(GMP) - Jeju(CJU))",
        "5. TW234: T'way Air's international flight (Seoul(ICN) - Singapore(SIN))",
        "6. LJ567: Jin Air's international flight (Seoul(ICN) - Hanoi(HAN))",
        "7. ZE890: Eastar Jet's international flight (Seoul(GMP) - Taiwan(TPE))",
        "8. LJ123: Jin Air's domestic flight (Seoul(GMP) - Gwangju(KWJ))",
        "9. 7C345: Jeju Air's domestic flight (Busan(PUS) - Seoul(GMP))",
        "10. BX678: Air Busan's international flight (Busan(PUS) - Hong Kong(HKG))",
        "11. TW901: T'way Air's international flight (Seoul(ICN) - Osaka(KIX))",
        "12. LJ432: Jin Air's domestic flight (Busan(PUS) - Jeju(CJU))",
        "13. BX567: Air Busan's domestic flight (Jeju(CJU) - Seoul(GMP))",
        "14. TW789: T'way Air's domestic flight (Jeju(CJU) - Busan(PUS))",
        "15. ZE234: Eastar Jet's international flight (Seoul(ICN) - Bangkok(BKK))",
        "16. OZ901: Asiana Airlines' international flight (Seoul(ICN) - Paris(CDG))",
        "17. 7C678: Jeju Air's domestic flight (Gwangju(KWJ) - Seoul(GMP))",
        "18. BX123: Air Busan's domestic flight (Jeju(CJU) - Busan(PUS))",
        "19. KE456: Korean Air's international flight (Seoul(ICN) - Los Angeles(LAX))",
        "20. TW345: T'way Air's international flight (Seoul(ICN) - Pacific(PPT))"
    };

    private final boolean[] reserveAvailableList = 
    {
        true, false, true, false, true, true, false, true, true, false, 
        true, true, false, true, true, false, true, true, true, false
    };

    public String getAirplace(String i) 
    {
        return airplaneList[Integer.parseInt(i)];
    }

    public String[] getAirpleList() 
    {
        return airplaneList;
    }

    public boolean[] getReserveAvailableList() 
    {
        return reserveAvailableList;
    }

    public String getFlightCode(String n) 
    {
        return airplaneList[Integer.parseInt(n)].substring(3, 8);
    }

    public boolean isAvailable(int index) 
    {
        return reserveAvailableList[index];
    }

    public void reserveFlight(int index) 
    {
        reserveAvailableList[index] = false;
    }
}
