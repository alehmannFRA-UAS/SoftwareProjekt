package immutable;

public final class Block {

    private final long timestamp;
    private final String data;
    private final String hash;

    public Block(long timestamp, String data) {
        this.timestamp = timestamp;
        this.data = data;
        this.hash = HashUtil.sha3Hex(timestamp + data);
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getData() {
        return data;
    }

    public String getHash() {
        return hash;
    }

}
