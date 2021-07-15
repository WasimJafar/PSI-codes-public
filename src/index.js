import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import Addition_ from './component/Addition.jsx'
import Add_numbers from './component/Add-two-numbers.jsx'
import Crud_Op from './component/crud.jsx'
import Router_ from './component/Router'
ReactDOM.render(
  <React.StrictMode>
    {/* msg :-> props */}
    {/* <App/> */}
    {/* <Addition_ msg="science-book" msg1="new-message"/>
    <Addition_ msg="maths-book"/> */}
    {/* <Add_numbers/> */}

    {/* <Crud_Op/> */}
    <Router_/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
