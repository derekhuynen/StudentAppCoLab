import React from 'react';
import {BrowserRouter as Router, Link, Route} from "react-router-dom";
import './App.css';
import AddPerson from "./Components/AddPerson";
import Table from "./Components/Table";

class App extends Component {
  render() {
      return (
          <Router>
            <Route exact path={"/"} component={AddPerson} />
            <Route exact path={"/view"} component={Table} />
          </Router>
      )
  }
}

export default App;
