package com.tw.spring.controller.beneficiario;

import com.tw.spring.service.ClienteBeneficiarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ClienteBeneficiarioController {

    private final ClienteBeneficiarioService service;

    @GetMapping("/beneficiario/listar")
    public ResponseEntity<List<ClienteBeneficiarioResponse>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/beneficiario/{id}")
    public ResponseEntity<ClienteBeneficiarioResponse> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PostMapping("/beneficiario/salvar")
    public ResponseEntity<ClienteBeneficiarioResponse> salvar(@RequestBody ClienteBeneficiarioRequest request){
        return ResponseEntity.ok(service.salvar(request));
    }

    @DeleteMapping("/beneficiario/deletar")
    public void deletar(){
        System.out.println("deletou");
    }

    @PutMapping("/beneficiario/atualizar")
    public void atualizar(){
        System.out.println("editado");
    }
}
