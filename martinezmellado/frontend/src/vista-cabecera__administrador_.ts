import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-cabecera__administrador_')
export class VistaCabecera__administrador_ extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;">
 <vaadin-horizontal-layout class="content" style="width: 100%; align-items: center; justify-content: space-between;">
  <vaadin-button style="margin-left: 1%;" id="bInicio">
    Inicio 
  </vaadin-button>
  <vaadin-button id="bBusqueda">
    Busqueda 
  </vaadin-button>
  <vaadin-horizontal-layout theme="spacing-s" style="margin-right: 1%; flex-grow: 0; flex-shrink: 1;">
   <vaadin-button style="flex-grow: 0; flex-shrink: 1; align-self: center;" id="bAdministrar">
     Administrar 
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="bPerfil">
    <iron-icon icon="lumo:user"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="bSalir">
    <iron-icon icon="vaadin:sign-out"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
