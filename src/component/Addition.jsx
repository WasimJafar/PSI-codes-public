import React from 'react'

class Addition_ extends React.Component {
    state = {  

    }

    constructor(props) {
        super(props)
    }

    render() { 
        return ( 
            <div>
                <h1>{this.props.msg} Welcome to first component {this.props.msg1}</h1>
            </div>
         );
    }
}
 
export default Addition_;
