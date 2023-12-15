package quanlynhatro.doanchuyennganh.controller;

import quanlynhatro.doanchuyennganh.entity.Phong;

import java.util.List;
public interface IController<C>{
    public List<C> getAllPhong();

    public C insert();
    public void delete();
    public C getById();
    public C update();
}
