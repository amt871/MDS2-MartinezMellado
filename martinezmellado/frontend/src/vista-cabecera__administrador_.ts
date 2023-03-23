import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-icons/vaadin-icons.js';

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
<vaadin-horizontal-layout class="content" style="width: 100%; align-items: flex-start; justify-content: space-between; padding-top: var(--lumo-space-s);">
 <vaadin-button style="margin-left: 5%;">
   Inicio 
 </vaadin-button>
 <vaadin-button>
   Busqueda 
 </vaadin-button>
 <vaadin-horizontal-layout theme="spacing" style="margin-right: 5%; flex-grow: 0; flex-shrink: 1;">
  <vaadin-button style="flex-grow: 0; flex-shrink: 1; align-self: center;">
    Administrar 
  </vaadin-button>
  <vaadin-button theme="icon" aria-label="Add new" id="iconPerfilButon">
   <iron-icon icon="lumo:user"></iron-icon>
  </vaadin-button>
  <vaadin-button theme="icon" aria-label="Add new" id="iconExitButton">
   <iron-icon icon="vaadin:sign-out"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
