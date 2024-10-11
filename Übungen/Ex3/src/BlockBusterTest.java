public class BlockBusterTest {

    public static void main(String[] args) {
        ProductionCompany productionCompany1 = new ProductionCompany("Warner Bros.", 1000000);
        BlockBuster blockBuster1 = new BlockBuster("Dune", productionCompany1, false, true);

        ProductionCompany productionCompany2 = new ProductionCompany("Disney", 2000000);
        BlockBuster blockBuster2 = new BlockBuster("Frozen", productionCompany2, true, false);

        testGetDurationOverlengthNon3D(blockBuster1);
        testGetDurationRegular3D(blockBuster1);

        testGetDurationOverlengthNon3D(blockBuster2);
        testGetDurationRegular3D(blockBuster2);
    }

    private static void testGetDurationOverlengthNon3D(BlockBuster blockBuster) {
        if (blockBuster.getDuration() != blockBuster.duration + 30) {
            System.out.println("Test failed: getDurationOverlengthNon3D");
        } else {
            System.out.println("Test passed: getDurationOverlengthNon3D");
        }
    }


    private static void testGetDurationRegular3D(BlockBuster blockBuster) {
        if (blockBuster.getDuration() != blockBuster.duration + 20) {
            System.out.println("Test failed: getDurationOverlength3D");
        } else {
            System.out.println("Test passed: getDurationOverlength3D");
        }
    }

}
