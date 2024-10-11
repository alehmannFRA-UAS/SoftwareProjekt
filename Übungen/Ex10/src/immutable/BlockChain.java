package immutable;

import java.util.LinkedList;

public class BlockChain {

    private LinkedList<Block> blocks;
    private String sha3Hex;

    public BlockChain() {
        blocks = new LinkedList<>();
    }

    public void addBlock(Block block) {
        blocks.add(block);
    }

    public Block getBlock(int index) {
        return blocks.get(index);
    }

    public int size() {
        return blocks.size();
    }

    public String getSha3Hex() {
        StringBuilder sb = new StringBuilder();
        for (Block block : blocks) {
            sb.append(block.getHash());
        }
        sha3Hex = HashUtil.sha3Hex(sb.toString());
        return sha3Hex;
    }

}
