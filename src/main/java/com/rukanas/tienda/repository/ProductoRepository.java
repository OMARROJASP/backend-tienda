package com.rukanas.tienda.repository;

import com.rukanas.tienda.entity.Categoria;
import com.rukanas.tienda.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
 @Query(
         value = "SELECT * FROM productos  WHERE productos.categoria = :categoria",
         nativeQuery = true

 )
 Iterable<Producto> findByCategoria(@Param("categoria") Integer categoria);
 Producto findByNombre(String nombre);
 Optional<Producto> findById(Integer id);


}
