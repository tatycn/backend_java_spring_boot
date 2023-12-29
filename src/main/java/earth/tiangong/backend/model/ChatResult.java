package earth.tiangong.backend.model;

public class ChatResult {
    private long chatId;
    private String result;

    public ChatResult(long chatId,String result) {
        this.chatId = chatId;
        this.result = result;
    }
    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}