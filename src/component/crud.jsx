import React from 'react'
import axios from 'axios'
import Pagination_ from './Pagination.jsx'

class Crud_Op extends React.Component {
    state = { 
        id : '',
        fname : '',
        lname : '',
        dob : '',
        phoneNo :'',
        area:'',
        flag: false,
        data: ''
     }

    setData = (event)  => {
        // console.dir(event)
        this.setState(
            {
                [event.target.name]: event.target.value
            }
        )
    }

    insert = (event) => {
        let obj = {
            id : this.state.id,
            fname : this.state.fname,
            lname : this.state.lname,
            dob : this.state.dob,
            phoneNo :this.state.phoneNo,
            area:this.state.area
        }
        let base_url = 'http://localhost:8081/student/'
        axios.post(base_url + 'addstudent', obj).
        then((response) => {
            alert('data inserted')
        }).
        catch((error) => console.log(error))
    } 

    display = () => {
        let base_url = 'http://localhost:8081/student/'
        axios.get(base_url).
        then((response) => {
            console.dir(response.data)
            this.setState({data  : response.data, flag : true})
        }).
        catch((error) => console.log(error))
    }

    fun = () => {
        this.setState({flag : false})
    }
    render() { 
        if(this.state.flag) {
            return (
                <Pagination_ data = {this.state.data} fun = {this.fun}/>
            )
        }
        else {
            return ( 
                <div>
                    <form action="/" className="form-inline">
                        
                        <label className="sr-only">Enter ID</label>
                        <input type="text" className="form-control" name="id" value={this.state.id} onChange={this.setData}/>
                        <br></br>
                        <label>Enter First Name </label>
                        <input type="text" className="form-control" name="fname" value={this.state.fname} onChange={this.setData}/>
                        <br></br>
                        <label>Enter Last Name: </label>
                        <input type="text" className="form-control" name="lname" value={this.state.lname} onChange={this.setData} />
                        <br></br>
                        <label>Enter DOB </label>
                        <input type="date" className="form-control" name="dob" value={this.state.dob} onChange={this.setData}/>
                        <br></br>
                        <label>Enter Phone no </label>
                        <input type="text" className="form-control" name="phoneNo" value={this.state.phoneNo} onChange={this.setData}/>

                        <label>Enter Area </label>
                        <input type="text" className="form-control" name="area" value={this.state.area} onChange={this.setData}/>

                        <input type="button" className="btn btn-primary mb-2" value="Insert" onClick={this.insert}/>
                        <input type="button" className="btn btn-primary mb-2" value="Display" onClick={this.display}/>

                    </form>  
                </div>

            );
        }
    }
}
 
export default Crud_Op;