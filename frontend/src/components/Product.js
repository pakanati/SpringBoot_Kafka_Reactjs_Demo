import React, { useEffect, useState } from 'react';
import { makeStyles } from '@material-ui/core/styles';
import TextField from '@material-ui/core/TextField';
import { Container ,Paper,Button} from '@material-ui/core';

const useStyles = makeStyles((theme) => ({
  root: {
    '& > *': {
      margin: theme.spacing(1),
     
    },
  },
}));

export default function Product() {
    const paperStyle={padding:'50px 20px', width:600,margin:"20px auto"}
    const[name,setName]=useState('')
    const[description,setDescription]=useState('')
    const[products,setProducts]=useState([])
     const classes = useStyles();

  const handleClick=(e)=>{
    e.preventDefault()
    const product={name,description}
    console.log(product)
    fetch("http://localhost:8080/product/add",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(product)

  }).then(()=>{
    console.log("New Product added")
  })
}

useEffect(()=>{
  fetch("http://localhost:8080/product/getAll")
  .then(res=>res.json())
  .then((result)=>{
    setProducts(result);
  }
)
},[])
  return (

    <Container>
        <Paper elevation={3} style={paperStyle}>
            <h1 style={{color:"blue"}}><u>Add New Product</u></h1>

    <form className={classes.root} noValidate autoComplete="off">
    
      <TextField id="outlined-basic" label="Name" variant="outlined" fullWidth 
      value={name}
      onChange={(e)=>setName(e.target.value)}
      />
      <TextField id="outlined-basic" label="Description" variant="outlined" fullWidth
      value={description}
      onChange={(e)=>setDescription(e.target.value)}
      />
      <Button variant="contained" color="secondary" onClick={handleClick}>
        Submit
      </Button>
    </form>
   
    </Paper>
    <h1>Products</h1>

    <Paper elevation={3} style={paperStyle}>

      {products.map(product=>(
        <Paper elevation={6} style={{margin:"10px",padding:"15px", textAlign:"left"}} key={product.id}>
         Id:{product.id}<br/>
         Name:{product.name}<br/>
         Description:{product.description}

        </Paper>
      ))
}


    </Paper>



    </Container>
  );
}
