package P12.CM;

public class nodeO {
    order data;
    nodeO next;
    nodeO prev;

    public nodeO(order data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}