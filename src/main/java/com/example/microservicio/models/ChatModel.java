package com.example.microservicio.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import java.util.Date;

public class ChatModel {
    @Id
    public ObjectId _id;

    public int emisor;
    public int receptor;
    public String mensaje;
    public Date fecha;

    // Constructors

    public ChatModel() {}

    public ChatModel(ObjectId _id, int emisor, int receptor, String mensaje, Date fecha) {
        this._id = _id;
        this.emisor = emisor;
        this.receptor = receptor;
        this.mensaje = mensaje;
        this.fecha = fecha;
    }

    // ObjectId needs to be converted to string
    public String get_id() { return _id.toHexString(); }
    public void set_id(ObjectId _id) { this._id = _id; }

    public int getEmisor() { return emisor; }
    public void setEmisor(int emisor) { this.emisor = emisor; }

    public int getReceptor() { return receptor; }
    public void setReceptor(int receptor) { this.receptor = receptor; }

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
}
