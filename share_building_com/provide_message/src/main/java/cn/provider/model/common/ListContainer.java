package cn.provider.model.common;

import java.util.List;

public class ListContainer<T> {
    public List<T> list;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
