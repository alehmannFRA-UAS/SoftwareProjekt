package immutable;

public class Main {

    public static void main(String[] args) {
        BlockChain blockChain = new BlockChain();
        blockChain.addBlock(new Block(0, "Hello"));
        blockChain.addBlock(new Block(1, "World"));
        System.out.println(blockChain.getSha3Hex());

        System.out.println(blockChain.getBlock(0).getHash());
        System.out.println(blockChain.getBlock(1).getHash());
    }

}
