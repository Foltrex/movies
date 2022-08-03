import logo from './logo.svg';
import './App.css';

import Footer from './components/Footer';
import Main from './components/Main';
import Navbar from './components/Navbar';

function App() {
  return (
    <table className="App">
      <tr>
        <td id='header'>
          <Navbar />  
        </td>
      </tr>
      <tr>
        <td>
          <Main />
        </td>
      </tr>
      <tr>
        <td id='footer'>
          <Footer />
        </td>
      </tr>
    </table>
  );
}

export default App;
