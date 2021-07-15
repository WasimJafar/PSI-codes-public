import React, {Component} from "react";
import Add_numbers from './Add-two-numbers'
import Home_ from "./Home";
import Crud_Op from "./crud";
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link
  } from "react-router-dom";
  
  class Router_ extends Component {
    state = { 

     }
    render() { 
        return ( 
            <Router>
      <div>
        <ul>
          <li>
            <Link to="/">Home</Link>
          </li>
            
          <li>
            <Link to="/addition">Addition of two numbers</Link>
          </li>
          <li>
            <Link to="/crud">CRUD</Link>
          </li>
         
        </ul>

        <hr />

        {/*
          A <Switch> looks through all its children <Route>
          elements and renders the first one whose path
          matches the current URL. Use a <Switch> any time
          you have multiple routes, but you want only one
          of them to render at a time
        */}
        <Switch>
        <Route exact path="/">
            <Home_ />
          </Route>
          <Route path="/addition">
            <Add_numbers />
          </Route>
          <Route path="/crud">
            <Crud_Op />
          </Route>
        </Switch>
      </div>
    </Router>

         );
    }
}
 


export default Router_;