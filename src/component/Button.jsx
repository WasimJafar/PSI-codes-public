import React from 'react'

class Button_ extends React.Component {
    state = {  }
    constructor(props) {
        super(props);
    }
    render() { 
        return ( 
            <div>
                <input type="submit" className="btn btn-primary mb-2" value={this.props.name} onClick={this.props.onClick}/>
            </div>
         );
    }
}
 
export default Button_;