package cn.provider.model.enums;

public enum  OrderState {
    //工单状态(0:待审核/1:客服已审核(未派单)/2:客服已派单/3:责任部门审核成功/4:责任部门审核失败/5:责任部门已接单/6:已完成/7:处理失败/8:已取消)

    待审核(0),

    未派单(1),

    客服已派单(2),

    责任部门审核成功(3),

    责任部门审核失败(4),

    责任部门已接单(5),

    已完成(6),

    处理失败(7),

    已取消(8);

    private Integer value;

    OrderState(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
