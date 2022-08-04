import React from 'react';

import {Link} from 'react-router-dom';
import Dropdown from 'react-bootstrap/Dropdown';

import {FontAwesomeIcon} from '@fortawesome/react-fontawesome';
import {faGlobe} from '@fortawesome/free-solid-svg-icons';

import '../assets/css/Navbar.css'

const Navbar = () => {
    return (
        <nav className='navbar navbar-expand-sm shadow-sm justify-content-center bg-white'>
            <ul className='navbar-nav'>
                <li className='nav-item'>
                    <Link to='series' className='nav-link'>Series</Link>
                </li>
                <li className='nav-item'>
                    <Link to='films' className='nav-link'>Films</Link>
                </li>
                <li className='nav-item'>
                    <Link to='' className='nav-link'>
                        <span className='logo-text'>Multimedia</span>
                    </Link>
                </li>
                <li className='nav-item'>
                    <Link to='cartoons' className='nav-link'>Cartoons</Link>
                </li>
                <li className='nav-item'>
                    <Link to='characters' className='nav-link'>Characters</Link>
                </li>
            </ul>

            <Dropdown id='lang-selector' className='nav-item'>
                <Dropdown.Toggle className='text-body border-0 bg-white'>
                    <FontAwesomeIcon icon={faGlobe} />
                </Dropdown.Toggle>

                <Dropdown.Menu>
                    <Dropdown.Item href="#">EN</Dropdown.Item>
                    <Dropdown.Item href="#">RU</Dropdown.Item>
                </Dropdown.Menu>
            </Dropdown>
        </nav>
    );
}

export default Navbar;
