package com.cburch.logisim.circuit;
import com.cburch.logisim.instance.InstanceData;

public class PropDelayData implements InstanceData {
    public PropDelayData clone() {
        try {
            return (PropDelayData)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("BAD NEWS BEARS");
            return null;
        }
    }

    public int propagationTime = 0;
}
