package edu.training.eCart.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import edu.training.eCart.Model.Products;


@Repository
public interface productRepo extends JpaRepository<Products,Integer> 
{

}
