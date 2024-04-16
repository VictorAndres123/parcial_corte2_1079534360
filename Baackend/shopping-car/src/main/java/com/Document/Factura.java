package com.Document;


public class Factura {
    @Id
    private String id;

    @Field
    private LocalDateTime fecha;
     
    @DBRef
    private Cliente cliente;
    
}
