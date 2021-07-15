import React from 'react'
import 'bootstrap/dist/css/bootstrap.min.css';
import Button_ from './Button';
import Take_input_ from './Take_Input';
import { Redirect } from 'react-router-dom';
class Add_numbers extends React.Component {
    state = { 
        num1 : 0,
        num2 : 0,
        res : 0,
        flag: false
    }
    
    setData = (event)  => {
        console.dir(event)
        this.setState(
            {
                [event.target.name]: event.target.value
            }
        )
    }

    clickHandle = (event) => {
        // event.preventDefault();
        console.log('Inside')
        let x = parseInt(this.state.num1) + parseInt(this.state.num2);
        this.setState({res : x})
    } 
    redirect = () => {
        this.setState({flag:true})
    }
    render() { 
        if(this.state.flag) {
            return (
                <Redirect to="/crud"/>
            )
        }
        else {
            return (
            
                <div className="container">
                    {/* <Take_input_/> */}
                    <form action="/" className="form-inline">
                        
                        <h1>Addition:</h1>
                        <label className="sr-only">Enter num1</label>
                        <input type="text" className="form-control" name="num1" value={this.state.num1} onChange={this.setData}/>
                        <br></br>
                        <label>Enter num2</label>
                        <input type="text" className="form-control" name="num2" value={this.state.num2} onChange={this.setData}/>
                        <br></br>
                        <label>Result: </label>
                        <input type="text" className="form-control" name="res" value={this.state.res} />
                        <br></br>
                        <input type="button" className="btn btn-primary mb-2" value="Addition" onClick={this.clickHandle}/>
                        <Button_ name="Add" onClick={this.clickHandle} />
                        <input type="button" className="btn btn-primary mb-2" value="Redirect" onClick={this.redirect}/>
    
                    </form> 
                    {/* <Button_ name="Add" click={this.clickHandle} /> */}
    
                </div>
            
              );
        }
    }
    
}
 
export default Add_numbers;