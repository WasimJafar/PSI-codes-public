import React from 'react'
class Take_input_ extends React.Component {
    state = {  }
    render() { 
        return ( 
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
                    {/* <input type="button" className="btn btn-primary mb-2" value="Addition" onClick={this.clickHandle}/>
                    <Button_ name="Add" click={this.clickHandle} /> */}
                </form> 
         );
    }
}
 
export default Take_input_;