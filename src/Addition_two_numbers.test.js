// const React = require("react");
import React from 'react'
import Adapter from 'enzyme-adapter-react-16'
import { shallow, configure, mount } from 'enzyme'

import Add_numbers from './component/Add-two-numbers'
import './setupTests'
import Button_ from './component/Button'

configure({
    adapter : new Adapter()
});

describe('Testing add component' , function(){
    
    it('Testing whether the component is mount or not' , function(){
        try {
            const wrapper = shallow(<Add_numbers></Add_numbers>)
        } catch (error) {
            fail()
        }
    })

    it('Testing whether the object is created or not' , function(){
        try {
            const wrapper = shallow(<Add_numbers></Add_numbers>)
            let obj = wrapper.instance();
        } catch (error) {
            fail()
        }
    })

    it('To count the number of input tags' , function(){
        try {
            const wrapper = shallow(<Add_numbers></Add_numbers>)
            // shallow:-> mount the html page
            // let obj = wrapper.instance();
            let len = wrapper.find('input').length
            expect(len).toBe(4)
        } catch (error) {
            fail()
        }
    })

    it('Testing H1 test' , function(){
        try {
            const wrapper = shallow(<Add_numbers></Add_numbers>)
            let obj = wrapper.instance();

            let message = wrapper.find('h1').at(0).text();
            expect(message).toEqual('Addition:')
            //Equal:-> compare only string values
            
        } catch (error) {
            fail()
        }
    })

    it('Testing the initial state values ' , function(){
        try {
            const wrapper = shallow(<Add_numbers></Add_numbers>)
            let obj = wrapper.instance();
            let num1 = obj.state.num1;
            expect(num1).toBe(0);
        } catch (error) {
            fail()
        }
    })
    
    it('Setting a values ' , function(){
        try {
            const wrapper = shallow(<Add_numbers></Add_numbers>)
            let obj = wrapper.instance();
            obj.setState({num1 : 10});

            let num1 = obj.state.num1;
            expect(num1).toBe(10);
        } catch (error) {
            fail()
        }
    })

    it('Setting a values ' , function(){
        try {
            const wrapper = shallow(<Add_numbers></Add_numbers>)
            let obj = wrapper.instance();
            obj.setState({num1 : 10, num2 : 20});
            console.log('Above simulate')
            wrapper.find('input').at(3).simulate('click')
            
            let res = obj.state.res;
            console.log(res)
            expect(res).toBe(30);
        } catch (error) {
            console.log(error)
            fail()
        }
    })

    it('Setting a values using Button ' , function(){
        try {
            const wrapper = shallow(<Add_numbers></Add_numbers>)
            let obj = wrapper.instance();
            obj.setState({num1 : 10, num2 : 20});
            console.log('Above simulate')
            wrapper.find('Button_').at(0).simulate('click')
            
            let res = obj.state.res;
            console.log(res)
            expect(res).toBe(30);
        } catch (error) {
            console.log(error)
            fail()
        }
    })

    it('Testing from the component object ' , function(){
        try {
            const wrapper = shallow(<Add_numbers></Add_numbers>)
            let obj = wrapper.instance();
            obj.setState({num1 : 10, num2 : 20});

            obj.clickHandle();
            let res = obj.state.res;
            
            expect(res).toBe(30);
        } catch (error) {
            console.log(error)
            fail()
        }
    })

    it('Testing whether the component is mount or not Button' , function(){
        try {
            const wrapper1 = shallow(<Add_numbers></Add_numbers>)
            let obj = wrapper1.instance();
            let obj1 = {
                name: 'Addition',
                onClick: obj.clickHandle
            }
            const wrapper = shallow(<Button_ name={obj1.name} onClick={obj1.onClick}/>)
            let object = wrapper.instance();
            console.log('After wrapper')
            // let data = wrapper.find('input').at(0).;
            console.log(data)
            let name = object.props.name;
            console.log('Name ' + name)
            expect(name).toEqual('Addition')
        } catch (error) {
            console.log(error)
            fail()
        }
    })



})

