import React, { Component,useEffect,useState } from 'react';
import axios from 'axios'
import '../../node_modules/react-bootstrap-table-next/dist/react-bootstrap-table2.min.css'
import '../../node_modules/react-bootstrap-table2-paginator/dist/react-bootstrap-table2-paginator.min.css'
import '../../node_modules/bootstrap/dist/css/bootstrap.min.css'
import BootstrapTable from 'react-bootstrap-table-next';
import paginationFactory from 'react-bootstrap-table2-paginator';
// import '../../node_modules/bootstrap/dist/js'

class Pagination_ extends Component {
    state = { 
        columns : [
            {dataField:"id",text:"Id"},
            {dataField:"fname",text:"First Name"},
            {dataField:"lname",text:"Last Name"},
            {dataField:"dob",text:"DOB"}, 
            {dataField:"phoneNo",text:"Phone Number"}
        ]
    }

    constructor(props) {
        super(props);
    }
    
    factory = paginationFactory({
        page: 2,
        sizePerPage: 5,
        lastPageText: '>>',
        firstPageText: '<<',
        nextPageText: '>',
        prePageText: '<',
        showTotal: true,
        alwaysShowAllBtns: true,
        onPageChange: function (page, sizePerPage) {
          console.log('page', page);
          console.log('sizePerPage', sizePerPage);
        },
        onSizePerPageChange: function (page, sizePerPage) {
          console.log('page', page);
          console.log('sizePerPage', sizePerPage);
        }
      });

    render() { 
        return ( 
            <div>
                <div className="container">
                    
                    <BootstrapTable keyField="id" data={this.props.data} columns={this.state.columns} pagination={this.factory}></BootstrapTable>
                    <input type="button" className="btn btn-primary mb-2" value="Insert" onClick={this.props.fun}/>

                </div>
            </div> 
         );
    }
}
 
export default Pagination_;
